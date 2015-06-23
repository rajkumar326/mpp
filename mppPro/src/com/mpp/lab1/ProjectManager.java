package com.mpp.lab1;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
	int projectManagerId;
	String name;
	List<Project> projects;
	String ssn;
	
	public ProjectManager(String name){
		this.name = name;
		this.projects = new ArrayList<Project>();
	}
	
	public void createProject(ProjectManager manager,String projectName){
		this.projects.add(new Project(manager, projectName));
	}
	
	public void addFeatureToSprint(Sprint sprint, Feature feature){
		sprint.addFeature(feature);
	}
	
	public Project getRelatedProject(String projectName)
	{
		return projects.get(0);
	}
}
