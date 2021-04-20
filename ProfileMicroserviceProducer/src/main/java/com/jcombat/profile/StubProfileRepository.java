package main.java.com.jcombat.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StubProfileRepository implements ProfileRepository {
	
	private Map<String, Profile> profileData = new HashMap<String, Profile>();
	
	public StubProfileRepository() {
		Profile profile = new Profile("001", "BKD1");
		profileData.put("001", profile);
		profile = new Profile("002", "BKD2");
		profileData.put("002", profile);
		profile = new Profile("003", "BKD3");
		profileData.put("003", profile);
	}
	
	@Override
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profileData.values());
	}

	@Override
	public Profile getProfile(String userId) {
		return profileData.get(userId);
	}

}