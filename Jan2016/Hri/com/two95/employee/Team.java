package com.two95.employee;

import java.util.List;

public class Team {
List<Recruiter>recruiter;
List<Marketing>marketing;

public Team(List<Recruiter> recruiter, List<Marketing> marketing) {
	
	this.recruiter = recruiter;
	this.marketing = marketing;
}
public List<Recruiter> getRecruiter() {
	return recruiter;
}
public void setRecruiter(List<Recruiter> recruiter) {
	this.recruiter = recruiter;
}
public List<Marketing> getMarketing() {
	return marketing;
}
public void setMarketing(List<Marketing> marketing) {
	this.marketing = marketing;
}
@Override
public String toString() {
	return "Team [recruiter=" + recruiter + ", marketing=" + marketing + "]";
}


}
