package com.lgd.study.shmtest;


import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lgd.study.inter.Inter;


public class APP implements Inter{
	private  SessionFactory sessionFactory;
    //private static SessionFactory sessionFactory1;
    
    
	
	





	

	public static void main(String[] args) throws ParseException  {
    
        //加载bean
       //new ClassPathXmlApplicationContext("applicationContext.xml");
       
APP app=new APP();
        Session session=app.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
       /* Food food=new Food();
        food.setFoodName("西红柿炒鸡蛋");
        food.setPrice(Float.parseFloat("12.2"));*/
       // Menu menu=new Menu();
        Group group=new Group();
        group.setGroupName("普通分组");
        //menu.setMenuName("普通菜单");
       /* Set<Food> foods=new HashSet<Food>();
        foods.add(food);
        menu.setFoods(foods);*/
        session.save(group);
        //session.save(menu);
       /* session.save(food);*/
       
        tx.commit();
        
       /* Session session=sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        State state=new State();
        state.setStateName("在售");
        session.save(state);
        tx.commit();
        */
       /* Group group=new Group();
        group.setGroupName("标准菜单");
        session.save(group);
        tx.commit();*/
        
        //session
       /* Calendar now= Calendar.getInstance(); 
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String date=format.format(now.getInstance().getTime());
        Date date1=new Date();  
       
        date1=format.parse(date);
        Session session=sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        String hql="from Dave where dt<:date";
        Query<Dave> query=session.createQuery(hql,Dave.class);
        query.setParameter("date",date1);
        
        List<Dave> list=query.getResultList();
        for(Dave d:list){
        	System.out.println(d.getDt()+"the id"+d.getId());
        }
        tx.commit();*/
        
        
        
       /* Session session=sessionFactory.openSession();
        Dave dave=new Dave();
        Calendar now= Calendar.getInstance(); 
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String date=format.format(now.getInstance().getTime());
        Date date1=new Date();  
       
        date1=format.parse("2018-03-10 14:44:32.0");
        dave.setDt(date1);
        Transaction tx=session.beginTransaction();
        
        session.save(dave);
        tx.commit();
        System.out.println("newType is OK!");*/
        
      /*  Session session = sessionFactory.openSession();    
        User user = new User();
        user.setName("lgd");
        user.setAge(22);
       
        Transaction tx = session.beginTransaction(); 
        session.save(user);
        tx.commit();
        System.out.println("AppMain is done.");*/
        
        
       /* 
        Session session1 = sessionFactory1.openSession();    
        User user1 = new User();
        user1.setName("lgd");
        user1.setAge(22);
       
        Transaction tx1 = session1.beginTransaction(); 
        session1.save(user1);
        tx1.commit();
        System.out.println("AppMain1 is done.");*/

    }












	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}












	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}












	public void update() {
		// TODO Auto-generated method stub
		
	}




    
    
}
