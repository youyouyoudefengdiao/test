package com.lgd.study.shmtest;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 菜单类
 * 
 * @author sakula
 *
 */
@Entity
@Table(name = "Menu")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer menu_id;// 菜单编号
	private String menuName;// 菜单名称
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER) // 禁止懒加载，级联更新
    @JoinColumn(name="menu_id") 
	private Set<Food> foods;// 单向一对多关联 包含的菜品
	@OneToOne // 单向一对一关联
	private Group group;// 所属分组
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Set<Food> getFoods() {
		return foods;
	}
	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
}
