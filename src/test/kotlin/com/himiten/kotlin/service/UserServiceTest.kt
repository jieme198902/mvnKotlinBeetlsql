package com.himiten.kotlin.service

import org.junit.Before
import org.junit.Test
import org.springframework.context.support.ClassPathXmlApplicationContext

/**
 * Created by Li on 2016/1/2.
 */
class UserServiceTest {
    private var userService: UserService? = null
    @Before
    fun before() {
        @SuppressWarnings("resource")
        val context = ClassPathXmlApplicationContext(
                *arrayOf("classpath:spring.xml", "classpath:spring-beetlSql.xml"))
        userService = context.getBean("userService") as UserService
    }

    @Test
    fun showUser() {
        val ulist = userService!!.getUserListTops(5)
        val users=userService!!.getUserByPhone("18818414614")
        println("结果集大小："+ulist.size)
        for (u in ulist) {
            System.out.println("username:" + u.uname + "--phone:" + u.phone)
        }
        println("结果集大小："+users.size)
        for (user in users) {
            System.out.println("按电话查询\n\nusername:" + user.uname + "--phone:" + user.phone)
        }

    }

}