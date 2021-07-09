/**
 * 
 */
package com.mm.vms.enitity;

/**
 * @author USER
 *
 */

public class Vendor {

	private Long id;
	private String name;
	private String category;
	private Integer grade;
	private Double rating;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the grade
	 */
	public Integer getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	/**
	 * @return the rating
	 */
	public Double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(Double rating) {
		this.rating = rating;
	}
		
}
