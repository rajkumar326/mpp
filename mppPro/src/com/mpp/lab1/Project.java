package com.mpp.lab1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
	public int projectId;
	public int projectManagerId;
	public String projectName;
	public Date startDate;
	public Date dueDate;
	public List<Feature> features;
	public List<Release> releases;
	public ProjectManager manager;
	
	public Project(ProjectManager manager,String name){
		this.projectName = name;
		this.manager = manager;
		this.features=new ArrayList<Feature>();
		this.releases = new ArrayList<Release>();
	}
	
	public void addFeature(Feature feature)
	{
		this.features.add(feature);
	}
	
	public void addRelease(Release release){
		this.releases.add(release);
	}
	
	public Release getRelease(String name)
	{
		//get selected release
		return releases.get(0);
	}
	
	
}
