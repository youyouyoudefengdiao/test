package com.lgd.study.shmtest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 菜品类
 * 
 * @author sakula
 *
 */
@Entity
@Table(name="Food")
public class Food {
	@Id//主键
	@GeneratedValue(strategy = GenerationType.AUTO)//自动生成主键
	private Integer food_id;// 菜品编号
	private String foodName;// 菜品名称
	@OneToOne
	private State foodState;// 菜品状态
	private String pricateName;// 菜品图片名
	private String pricateAddress;// 菜品图片存放地址
	private float price;// 菜品价格
	@Transient//不加入数据库
	private Menu menu;//菜单
	
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Integer getFood_id() {
		return food_id;
	}

	public void setFood_id(Integer food_id) {
		this.food_id = food_id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public State getFoodState() {
		return foodState;
	}

	public void setFoodState(State foodState) {
		this.foodState = foodState;
	}

	public String getPricateName() {
		return pricateName;
	}

	public void setPricateName(String pricateName) {
		this.pricateName = pricateName;
	}

	public String getPricateAddress() {
		return pricateAddress;
	}

	public void setPricateAddress(String pricateAddress) {
		this.pricateAddress = pricateAddress;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
