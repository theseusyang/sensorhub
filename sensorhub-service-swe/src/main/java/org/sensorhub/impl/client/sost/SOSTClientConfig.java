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

package org.sensorhub.impl.client.sost;

import org.sensorhub.api.module.ModuleConfig;


/**
 * <p>
 * Configuration class for the SOS-T client module
 * </p>
 *
 * <p>Copyright (c) 2015</p>
 * @author Alexandre Robin <alex.robin@sensiasoftware.com>
 * @since Feb 6, 2015
 */
public class SOSTClientConfig extends ModuleConfig
{
    private static final long serialVersionUID = 1L;

    
    /**
     * SOS endpoint URL where the requests are sent
     */
    public String sosEndpointUrl;

    
    /**
     * Local ID of sensor to register with SOS
     */
    public String sensorID;

    
    /**
     * set to true to use a persistent Insertresult connection
     */
    public boolean usePersistentConnection;

    
    /**
     * Maximum number of connection errors before we stop sending data to remote server
     */
    public int maxConnectErrors = 10;
}
