/***************************** BEGIN LICENSE BLOCK ***************************

 The contents of this file are Copyright (C) 2013 Sensia Software LLC.
 All Rights Reserved.
 
 Contributor(s): 
    Alexandre Robin <alex.robin@sensiasoftware.com>
 
******************************* END LICENSE BLOCK ***************************/

package org.sensorhub.test.sensor;

import net.opengis.sensorml.v20.AbstractProcess;
import org.sensorhub.api.common.SensorHubException;
import org.sensorhub.api.sensor.ISensorDataInterface;
import org.sensorhub.api.sensor.SensorConfig;
import org.sensorhub.api.sensor.SensorException;
import org.sensorhub.impl.sensor.AbstractSensorModule;


public class FakeSensor extends  AbstractSensorModule<SensorConfig>
{
        
    public FakeSensor()
    {        
    }
    
    
    public void setDataInterfaces(ISensorDataInterface... outputs) throws SensorException
    {
        for (ISensorDataInterface o: outputs)
            obsOutputs.put(o.getRecordDescription().getName(), o);
    }
    

    @Override
    public void updateConfig(SensorConfig config) throws SensorHubException
    {
    }


    @Override
    public void start() throws SensorHubException
    {
        for (ISensorDataInterface o: obsOutputs.values())
            ((FakeSensorData)o).start();
    }
    
    
    @Override
    public void stop() throws SensorHubException
    {        
    }


    @Override
    public AbstractProcess getCurrentSensorDescription() throws SensorException
    {
        AbstractProcess sml = super.getCurrentSensorDescription();
        sml.setUniqueIdentifier("urn:sensors:mysensor:001");        
        return sml;
    }


    @Override
    public boolean isConnected()
    {
        return true;
    }
    
    
    @Override
    public void cleanup() throws SensorHubException
    {
    }
}
