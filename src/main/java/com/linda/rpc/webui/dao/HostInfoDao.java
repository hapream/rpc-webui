package com.linda.rpc.webui.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.linda.rpc.webui.pojo.HostInfo;

/**
 * @author AutoGenerated by lindzh
 * 2016年12月15日 16:54
 */
public interface HostInfoDao {

	public int addHostInfo(HostInfo obj);

	public HostInfo getById(@Param("id")long id);
	
	public int updateById(@Param("obj")HostInfo obj);
	
	public int deleteById(@Param("id")long id);
	
	
	public List<HostInfo> getListByHost(@Param("host")String host,@Param("limit")int limit,@Param("offset") int offset);
	
	public long getCountByHost(@Param("host")String host);
	
	
	public List<HostInfo> getListByAppIdAndStatus(@Param("appId")long appId,@Param("status")int status,@Param("limit")int limit,@Param("offset") int offset);
	
	public long getCountByAppIdAndStatus(@Param("appId")long appId,@Param("status")int status);
	
}
