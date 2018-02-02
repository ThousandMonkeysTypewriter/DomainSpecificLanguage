package com.dsl.formats.detection_log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Event {
  public Source _source;
  public Date date;
  
  public int year;
  public int month;
  public int day;
  
  public int hour;
  public int minute;
  public int second;
  
  public String getTimeStamp() {
    return _source.timestamp;
  }

  public void setTimes() throws ParseException {
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    date = df.parse(_source.timestamp);
    
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    year = cal.get(Calendar.YEAR);
    month = cal.get(Calendar.MONTH);
    day = cal.get(Calendar.DAY_OF_MONTH);
    hour = cal.get(Calendar.HOUR);
    minute = cal.get(Calendar.MINUTE);
    second = cal.get(Calendar.SECOND);
  }
}

class Source {
  public String input_type;
  public Integer upstream_times;
  public Integer bytes;
  public Integer status;
  public String term;
  /*"beat": {
      "hostname": "ip-172-31-29-17",
      "name": "ip-172-31-29-17",
      "version": "5.5.1"
    },*/
  public String remote_ip;
  /*"tags": [
      "balancer"
    ],*/
  public Double request_time;
  public String service;
  public String vhost;
  /*"xff": [
      "91.220.181.76"
    ],*/
  public String timestamp;
  public String source;
  /*"upstream_addr": [
      "18.195.157.148:80"
    ],
    String region_id; 
    "request": "/prefix?term=Пароварка&region_id=52",
    "offset": 271993406,
    "upstream_status": 0,
    "client": "mvideo",
    "type": "log",
    "agent": "",
    "cache": true,
    "host": "ip-172-31-29-17",
    "@version": "1",
    "method": "GET"*/
}
