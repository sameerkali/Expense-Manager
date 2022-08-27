package com.web.expancemanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_room_details")
public class UserRoomDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String roomid;
	
	
	private int user_id;

}
