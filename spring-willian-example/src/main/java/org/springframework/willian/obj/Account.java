package org.springframework.willian.obj;

import lombok.Data;

/**
 * @author <a href="mailto:wangyan@cai-inc.com">沐风</a>
 * @datetime 2024-06-20 14:17:09
 */
@Data
public class Account {

	/**
	 * 账号名
	 */
	private String name;
	/**
	 * 账号密码
	 */
	private String password;
}
