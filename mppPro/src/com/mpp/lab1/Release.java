package com.mpp.lab1;

import java.util.*;
import java.util.Date;

public class Release {
	int releaseId;
	int projectId;
	String version;
	Date releaseDate;
	
	List<Sprint> sprints;
	
	public Release(String version){
		this.version = version;
		this.sprints = new ArrayList<Sprint>();
	}
	
	public void addSprint(Sprint sprint){
		this.sprints.add(sprint);
	}
	public Sprint getSprint(String name)
	{
		//get sprint by name
		return sprints.get(0);
	}
}
