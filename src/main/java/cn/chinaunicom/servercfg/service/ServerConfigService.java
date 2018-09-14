package cn.chinaunicom.servercfg.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

import cn.chinaunicom.servercfg.entity.ServerConfig;

/**
 * **************************************
 * 描述: 服务管理
 * @ClassName: cn.chinaunicom.servercfg.service.ServerConfigService 
 * @author zhw 
 * @version V1.0
***************************************
 */
public interface ServerConfigService extends IService<ServerConfig> {

	/**
	 * 
	*描述: 根据模块名获取服务注册信息
	*@param module
	*@return List<ServerConfig>
	 */
	public List<ServerConfig> getByModule(String module);
	
	/**
	 * 
	*描述: 保存服务注册信息
	*@param entity
	*@return Integer
	 */
	public Integer saveServer(ServerConfig entity);
}
