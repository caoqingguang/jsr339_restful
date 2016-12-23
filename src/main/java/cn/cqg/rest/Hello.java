package cn.cqg.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by caoqingguang on 2016/12/23.
 */
@Path("/hello")
public class Hello {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/text")
  public String getStr(){
    return "hello world";
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("json")
  public Map<String,Object> getJson(){
    Map<String, Object> map = new HashMap<>();
    map.put("data",new int[]{1,2,5});
    map.put("code",200);
    return map;
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("args")
  public Map<String,Object> getArgs(@QueryParam("name") String name,@DefaultValue("30")@QueryParam("age")int age){
    Map<String, Object> map = new HashMap<>();
    map.put("name",name);
    map.put("age",age);
    map.put("code",200);
    return map;
  }



}
