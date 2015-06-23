package com.mpp.lab1;

import java.util.Date;
import java.util.List;

public class Report {
	int reportId;
	Date reportDate;

	public List<Feature> workCompleted(Project prj,Sprint sprint) {
		//prj.manager.
		return null;//Returns the list of feature that are completed from the sprint object by checking their status
	}

	public List<Feature> workRemaining(Project prj, Sprint sprint) {
		return null;//Returns the list of feature that are remaining from the sprint object by checking their status
	}
}
