/***************************** BEGIN LICENSE BLOCK ***************************

The contents of this file are subject to the Mozilla Public License, v. 2.0.
If a copy of the MPL was not distributed with this file, You can obtain one
at http://mozilla.org/MPL/2.0/.

Software distributed under the License is distributed on an "AS IS" basis,
WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
for the specific language governing rights and limitations under the License.
 
The Initial Developer is Sensia Software LLC. Portions created by the Initial
Developer are Copyright (C) 2014 the Initial Developer. All Rights Reserved.
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.api.module;

import org.sensorhub.api.common.IEventListener;
import org.sensorhub.api.common.IEventProducer;
import org.sensorhub.api.common.SensorHubException;


/**
 * <p>
 * Generic interface for all modules in the system.
 * </p>
 *
 * <p>Copyright (c) 2010</p>
 * @author Alexandre Robin
 * @param <ConfigType> 
 * @since Nov 12, 2010
 */
public interface IModule<ConfigType extends ModuleConfig> extends IEventProducer
{    
    
    /**
     * Retrieves a copy of the module configuration
     * (i.e. for reading only since changes won't have any effect until updateConfig is called)
     * @return a copy of the configuration object associated to this module
     */
    public ConfigType getConfiguration();
    
    
    /**
     * Helper method to get the module's name
     * @return name string
     */
    public String getName();
    
    
    /**
     * Helper method to get the module's local ID
     * @return id string
     */
    public String getLocalID();
    
    
    /**
     * Checks if module is enabled
     * @return true if module is enabled, false otherwise
     */
    public boolean isEnabled();
    
    
    /**
     * Initializes the module with the specified configuration
     * @param config
     * @throws SensorHubException 
     */
    public void init(ConfigType config) throws SensorHubException;
    
    
    /**
     * Updates the module's configuration dynamically
     * The module must honor this new configuration unless an error is detected
     * @param config
     * @throws SensorHubException 
     */
    public void updateConfig(ConfigType config) throws SensorHubException;
    
    
    /**
     * Starts the module with the current configuration
     * @throws SensorHubException
     */
    public void start() throws SensorHubException;
    
    
    /**
     * Stops the module
     * All temporary resources created by the module should be cleaned
     * when this is called (ex: memory, files, connections, etc.)
     * @throws SensorHubException
     */
    public void stop() throws SensorHubException;
    
    
    /**
     * Saves the state of this module to the provided output stream
     * @param saver
     * @throws SensorHubException 
     */
    public void saveState(IModuleStateSaver saver) throws SensorHubException;
    
    
    /**
     * Restores the state of this module from info provided by the input stream
     * @param loader
     * @throws SensorHubException 
     */
    public void loadState(IModuleStateLoader loader) throws SensorHubException;
    
    
    /**
     * Cleans up all ressources used by the module when deleted
     * All persistent resources created by the module should be cleaned
     * when this is called
     * @throws SensorHubException
     */
    public void cleanup() throws SensorHubException;
    
    
    /**
     * Registers a listener to receive events generated by this module
     * @param listener
     */
    @Override
    public void registerListener(IEventListener listener);
    
    
    /**
     * Unregisters a listener and thus stop receiving events generayed by this module
     * @param listener
     */
    @Override
    public void unregisterListener(IEventListener listener);    
}
