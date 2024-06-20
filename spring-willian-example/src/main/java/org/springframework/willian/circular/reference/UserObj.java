package org.springframework.willian.circular.reference;

import lombok.Data;

/**
 * @author <a href="mailto:wangyan@cai-inc.com">沐风</a>
 * @datetime 2024-06-19 17:33:48
 */
@Data
public class UserObj {

	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 身份信息bean
	 */
	private IdCardObj idCard;

	@Override
	public String toString() {

		return "UserObj{" + "age=" + getAge() + ", userName='" + getUserName() + "', idCard='" + getIdCard().getIdCard() + "'}";
	}
}
