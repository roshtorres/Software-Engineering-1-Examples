package com.annotations.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FlavoredMilkTea 
{
	@Autowired
	@Value("50% Level")
	private String sugarLevel;
	
	@Autowired
	@Value("Large")
	private String size;
	
	@Autowired
	@Qualifier("taro")
	private MilkTea milkTea;
	
	public String getSugarLevel() 
	{
		return sugarLevel;
	}
	public void setSugarLevel(String sugarLevel) 
	{
		this.sugarLevel = sugarLevel;
	}
	
	public String getSize() 
	{
		return size;
	}
	public void setSize(String size) 
	{
		this.size = size;
	}
	
	public MilkTea getMilkTea() 
	{
		return milkTea;
	}
	public void setMilkTea(MilkTea milkTea) 
	{
		this.milkTea = milkTea;
	}
	
	public String toString()
	{
		String output = new String();
		
		output += "Sugar level: " + sugarLevel + "\n";
		output += "Size: " + size + "\n";
		output += milkTea.prepareIngredients() + "\n";
		output += milkTea.mix();
		
		return output;
	}

}
