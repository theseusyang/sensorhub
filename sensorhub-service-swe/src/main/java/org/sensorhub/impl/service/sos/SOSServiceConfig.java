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

package org.sensorhub.impl.service.sos;

import java.util.ArrayList;
import java.util.List;
import org.sensorhub.impl.service.ogc.OGCServiceConfig;


/**
 * <p>
 * Configuration class for the SOS service module
 * </p>
 *
 * <p>Copyright (c) 2013</p>
 * @author Alexandre Robin <alex.robin@sensiasoftware.com>
 * @since Sep 7, 2013
 */
public class SOSServiceConfig extends OGCServiceConfig
{
    private static final long serialVersionUID = -957079629610700869L;

    
    /**
     * set to true to enable transactional operation support
     */
    public boolean enableTransactional = false;
    
    
    /**
     * Providers configurations
     */
    public List<SOSProviderConfig> dataProviders = new ArrayList<SOSProviderConfig>();
    
    
    /**
     * Consumers configurations 
     */
    public List<SOSConsumerConfig> dataConsumers = new ArrayList<SOSConsumerConfig>();
}
