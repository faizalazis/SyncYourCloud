package api;

import java.util.ArrayList;
import java.util.Iterator;

import com.dropbox.client2.jsonextract.JsonExtractionException;
import com.dropbox.client2.jsonextract.JsonMap;

public class ManageDrive {
	
	public Config currentconf;
	
	public ArrayList<IntDrive> loadDrives(String confpath){
		ArrayList<IntDrive> drives = new ArrayList<IntDrive>();
		currentconf = new api.Config(confpath);
		DriveDropBox.init(currentconf.dropbox_app_key);
		Iterator<JsonMap> drivesConfIterator = currentconf.drives.iterator();
		while(drivesConfIterator.hasNext()){
			JsonMap confDrive = drivesConfIterator.next();
			try {
				switch (confDrive.get("type").expectString()) {
				case "dropbox": 
					drives.add(new DriveDropBox(confDrive));
					break;

				default:
					break;
				}
			} catch (JsonExtractionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return drives;
	}

}