package com.github.jmchilton.blend4j.galaxy;

import com.github.jmchilton.blend4j.galaxy.beans.History;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

class HistoryClientImpl extends Client implements HistoryClient {
  HistoryClientImpl(GalaxyInstanceImpl galaxyInstance) {
    super(galaxyInstance, "history", true);
  }

  public ClientResponse createRequest(final History history) {
    return super.create(history);
  }

  public History create(final History history) {
    return createRequest(history).getEntity(History.class);
  }

  @Override
	public ClientResponse setAsCurrent(String historyId) {
		WebResource res = getSetAsCurrentWebResource(historyId);
		ClientResponse t = res.header("x-api-key", "c5f8040ae2f7dd8bc648c583eb2d84ad").get(ClientResponse.class);
		return t;
//  	return super.create(workflowInputs);
	}

//	public WorkflowOutputs setAsCurrent(final WorkflowInputs workflowInputs) {
//		return runWorkflowResponse(workflowInputs).getEntity(WorkflowOutputs.class);
//	}
  
//	protected WebResource getSetAsCurrentWebResource() {
//		return this.getGalaxyInstance().getWebResource().path("set_as_current");
//	}

	/**
	 * Returns the WebResource for SetAsCurrents of the specified workflow.
	 * @param workflowId ID of the specified workflow.
	 * @return
	 */
	protected WebResource getSetAsCurrentWebResource(String historyId) {
		WebResource resource = getWebResource().path("set_as_current").queryParam("id", historyId);
		return resource;
	}

//	private WebResource getRootWebResource() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	/**
//	 * Returns the WebResource for the specified SetAsCurrent of the specified workflow.
//	 * @param workflowId ID of the specified workflow.
//	 * @param SetAsCurrentId ID of the specified SetAsCurrent.
//	 * @return
//	 */
//	protected WebResource getSetAsCurrentWebResource(String historyId, String setAsCurrentId) {
//		return getWebResource().path(historyId).path("set_as_current").path(setAsCurrentId);
//	}
}
