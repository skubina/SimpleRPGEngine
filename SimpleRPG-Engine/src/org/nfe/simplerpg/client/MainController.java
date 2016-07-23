package org.nfe.simplerpg.client;

import org.nfe.simplerpg.client.rpc.RPCService;
import org.nfe.simplerpg.client.rpc.RPCServiceAsync;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class MainController {
	
	RPCServiceAsync rpcService;

	public MainController() {
		super();
		
		rpcService = GWT.create(RPCService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) this.rpcService;
		endpoint.setServiceEntryPoint(GWT.getModuleBaseURL() + "rpc");
	}
	
	

}
