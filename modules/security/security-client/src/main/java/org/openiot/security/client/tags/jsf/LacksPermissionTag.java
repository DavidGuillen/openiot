package org.openiot.security.client.tags.jsf;

import javax.faces.view.facelets.TagConfig;

import org.apache.shiro.web.faces.tags.PermissionTagHandler;
import org.openiot.security.client.AccessControlUtil;

public class LacksPermissionTag extends PermissionTagHandler {


	public LacksPermissionTag(TagConfig config) {
		super(config);
	}

	@Override
	protected boolean showTagBody(String p) {
		return getSubject() == null || !AccessControlUtil.getInstance().hasPermission(p);
	}

}
