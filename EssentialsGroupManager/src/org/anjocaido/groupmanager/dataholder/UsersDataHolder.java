package org.anjocaido.groupmanager.dataholder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.anjocaido.groupmanager.data.User;



/**
 * @author ElgarL
 * 
 */
public class UsersDataHolder {

	/**
	 * Root World name this set of groups is associated with.
	 */
	private String name;
	private File usersFile;
	private boolean haveUsersChanged = false;
	private long timeStampUsers = 0;

	/**
	 * The actual groups holder
	 */
	private Map<String, User> users = new HashMap<String, User>();

	/**
	 * Constructor
	 */
	protected UsersDataHolder() {
	}

	/**
	 * @param worldName
	 */
	public void setWorldName(String worldName) {
		this.name = worldName;
	}
	
	/**
	 * @return the name
	 */
	public String getWorldName() {
		return this.name;
	}

	/**
	 * @return the users
	 */
	public Map<String, User> getUsers() {
		return users;
	}
	
	/**
	 * @param users the users to set
	 */
	public void setUsers(Map<String, User> users) {
		this.users = users;
	}

	/**
	 * @return the usersFile
	 */
	public File getUsersFile() {
		return usersFile;
	}

	/**
	 * @param usersFile the usersFile to set
	 */
	public void setUsersFile(File usersFile) {
		this.usersFile = usersFile;
	}

	/**
	 * @return the haveUsersChanged
	 */
	public boolean HaveUsersChanged() {
		return haveUsersChanged;
	}

	/**
	 * @param haveUsersChanged the haveUsersChanged to set
	 */
	public void setUsersChanged(boolean haveUsersChanged) {
		this.haveUsersChanged = haveUsersChanged;
	}

	/**
	 * @return the timeStampUsers
	 */
	public long getTimeStampUsers() {
		return timeStampUsers;
	}

	/**
	 * @param timeStampUsers the timeStampUsers to set
	 */
	public void setTimeStampUsers(long timeStampUsers) {
		this.timeStampUsers = timeStampUsers;
	}

}