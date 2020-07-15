package controller;

import model.WaterBody;

public class Controller
{
	//?
	private static Controller instance = null;
	
	private Controller()
	{
		//Create Clips Environment and load Clips rules
	}
	
	//Singleton?
	public static Controller getInstance()
	{
		if (instance == null) 
		{
			instance = new Controller();
		}
		return instance;
	}
	
	public void executeClips() {
		//Run Clips and return the results
	}

	public int addWaterBody(int id, String name, String river, String basin, String type, String city, String province) 
	{
		int status=1;
		WaterBody wb = searchWaterBody(name);
		if(wb==null)
		{
			// Success: new water body will be added
			status=0;
			wb = new WaterBody(id,name,river,basin,type,city,province);
			// Missing method to persist like WaterBodyDAO.getInstance().saveOrUpdateProveedor(wb);
		}
		return status;
	}
	
    private WaterBody searchWaterBody(String name) 
    {
    	return null;
    	// return WaterBodyDAO.getInstance().getWaterBody(name);
	}
	
}