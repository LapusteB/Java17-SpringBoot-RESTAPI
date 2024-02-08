package com.spring1.springframework1;

public class Topic {


	private long id;
	private String name;
	private String description;
	
	public Topic(long id, String name, String description)
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		
	}
	
	
	public long getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	@Override
	public String toString()
	{
		return "Topic [id= " + id + ", name= " + name + '\n' + description;
		
	}
	
}
