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

package org.sensorhub.impl.sensor.drivers;

import java.net.InetAddress;
import org.sensorhub.api.sensor.SensorDriverConfig;


/**
 * <p>
 * Driver configuration options for the TCP/IP network protocol
 * </p>
 *
 * <p>Copyright (c) 2010</p>
 * @author Alexandre Robin
 * @since Nov 5, 2010
 */
public class TCPDriverConfig extends SensorDriverConfig
{
	private static final long serialVersionUID = 9140070588893081102L;
	

    public InetAddress networkAddress;
	
	public int port;
	
	public boolean discoverAddress;
}
