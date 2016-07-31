package com.childraise.medical;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;  
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;  
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; 
/**
 * @author Jason_zh
 * @date 2016��6��5��
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)		//��ʾ�̳���SpringJUnit4ClassRunner��
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
//��Ȼ ���������һ��������� ÿ����Ԫ���Զ���������ع� ���۳ɹ����  
@TransactionConfiguration(defaultRollback = true)  
//�ǵ�Ҫ��XML�ļ�����������Ŷ~~~���ǲ���ע��ķ�ʽ  
@Transactional  
public class UserTest {
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		// webAppContextSetup ע�������static import  
        // webAppContextSetup �����WEB�����������fileter ���ǲ������listenCLASS  
        // WebApplicationContext context =  
        // ContextLoader.getCurrentWebApplicationContext();  
        // ����������������Ϸ��� ��ᱨ��ָ��  
        this.mockMvc = webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void test1() throws Exception {
		//User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("ֵ��"+user.getUserName());
		mockMvc.perform((post("/user/register.do"))
		.param("telephone", "123456").param("password", "123456"))
		.andExpect(status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.status").value("1001"))
		.andDo(print());
	}
}
