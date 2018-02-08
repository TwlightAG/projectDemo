package com.example.demo.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String id;
	private String Page_ID;
	private ArrayList Errors;
	private ArrayList Findings;
	private ArrayList Date_Time;
	private String title;
	private ArrayList meta;
	private ArrayList links;
	private ArrayList div; 
	private ArrayList form;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPage_ID() {
		return Page_ID;
	}
	public void setPage_ID(String page_ID) {
		Page_ID = page_ID;
	}
	public ArrayList getErrors() {
		return Errors;
	}
	public void setErrors(ArrayList errors) {
		Errors = errors;
	}
	public ArrayList getFindings() {
		return Findings;
	}
	public void setFindings(ArrayList findings) {
		Findings = findings;
	}
	public ArrayList getDate_Time() {
		return Date_Time;
	}
	public void setDate_Time(ArrayList date_Time) {
		Date_Time = date_Time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList getMeta() {
		return meta;
	}
	public void setMeta(ArrayList meta) {
		this.meta = meta;
	}
	public ArrayList getLinks() {
		return links;
	}
	public void setLinks(ArrayList links) {
		this.links = links;
	}
	public ArrayList getDiv() {
		return div;
	}
	public void setDiv(ArrayList div) {
		this.div = div;
	}
	public ArrayList getForm() {
		return form;
	}
	public void setForm(ArrayList form) {
		this.form = form;
	}
	
	

}
