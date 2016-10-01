package com.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Date date;
	
	private String ip;
	private String device;
	private String protocol;
	private String method;
	private String parameter;
	private String body;
	
	protected Request(){}

	public Request(String ip, String device, String protocol, String method, String parameter, String body) {
		super();
		this.date = new Date((new java.util.Date().getTime()));
		this.ip = ip;
		this.device = device;
		this.protocol = protocol;
		this.method = method;
		this.parameter = parameter;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", date=" + date + ", ip=" + ip + ", device=" + device + ", protocol=" + protocol
				+ ", method=" + method + ", parmeter=" + parameter + ", body=" + body + "]";
	}

	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public String getIp() {
		return ip;
	}

	public String getDevice() {
		return device;
	}

	public String getProtocol() {
		return protocol;
	}

	public String getMethod() {
		return method;
	}

	public String getParameter() {
		return parameter;
	}

	public String getBody() {
		return body;
	}	
}