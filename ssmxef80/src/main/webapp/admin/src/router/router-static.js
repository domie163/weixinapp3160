import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import siji from '@/views/modules/siji/list'
    import news from '@/views/modules/news/list'
    import kechedengji from '@/views/modules/kechedengji/list'
    import dingdanxinxi from '@/views/modules/dingdanxinxi/list'
    import users from '@/views/modules/users/list'
    import shiwuzhaoling from '@/views/modules/shiwuzhaoling/list'
    import chengkedengji from '@/views/modules/chengkedengji/list'
    import chengke from '@/views/modules/chengke/list'
    import chepiaoxinxi from '@/views/modules/chepiaoxinxi/list'
    import tongzhixinxi from '@/views/modules/tongzhixinxi/list'
    import tuipiaoxinxi from '@/views/modules/tuipiaoxinxi/list'
    import config from '@/views/modules/config/list'
    import discussshiwuzhaoling from '@/views/modules/discussshiwuzhaoling/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/siji',
        name: '司机',
        component: siji
      }
          ,{
	path: '/news',
        name: '资讯信息',
        component: news
      }
          ,{
	path: '/kechedengji',
        name: '客车登记',
        component: kechedengji
      }
          ,{
	path: '/dingdanxinxi',
        name: '订单信息',
        component: dingdanxinxi
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/shiwuzhaoling',
        name: '失物招领',
        component: shiwuzhaoling
      }
          ,{
	path: '/chengkedengji',
        name: '乘客登记',
        component: chengkedengji
      }
          ,{
	path: '/chengke',
        name: '乘客',
        component: chengke
      }
          ,{
	path: '/chepiaoxinxi',
        name: '车票信息',
        component: chepiaoxinxi
      }
          ,{
	path: '/tongzhixinxi',
        name: '通知信息',
        component: tongzhixinxi
      }
          ,{
	path: '/tuipiaoxinxi',
        name: '退票信息',
        component: tuipiaoxinxi
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/discussshiwuzhaoling',
        name: '失物招领评论',
        component: discussshiwuzhaoling
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
