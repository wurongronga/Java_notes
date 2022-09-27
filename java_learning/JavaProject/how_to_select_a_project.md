# How to select a Java project

> <https://www.bilibili.com/video/BV1VT4y1r71g/?spm_id_from=333.337.search-card.all.click>

1. 技术选型
   1. development framework: spring framework, 
      1. SSH ——Struts、Spring、Hibernate
      2. Spring +SpringMVC + Hibernate/ibatis
      3. SSM —— Spring+SpringMVC+Mybatis—— 主流
      4. Springboot+Mybatis——兴起
      5. 微服务框架——springboot+dubbo、springcloud—— 前沿
   2. data store structure: 
      1. 持续性存储：mysql, hbase
      2. 缓存存储：redis
   3. 通讯方式
      1. 同步通信 synchronous communication：http，rpc，dubbo
      2. 异步通信 asynchronous communication
2. 项目背景
   技术都是相通的，在有一定技术背景的情况下，多多结合自己以前做过的，或者正在做的项目，尝试套用不同的技术将它做成一个属于自己的项目。
   不然先做一些小项目明白原理，练练手 
3. 项目实现
4. 项目亮点设计
   1. 提升代码质量
      1. 做好测试
           - （unit test），
           - `代码覆盖率?` ，
           - 代码用例测试，开源测试框架，使用可以自动测试的工具可以写在里面
   2. 让项目上线（比较难，可以找小项目）
      1. 部署到服务器上，而不只是local，比如云服务器上，分布式更好，有一个管理员洁面，或者前段界面，用来展示项目的运行情况
   3. 项目压测：项目可以承受多大的访问量
      1. matrix：qps，tps
      2. 发现性能瓶颈，如何修复，修复后的提升在哪里
      3. 可以人造性能瓶颈：之前没用缓存，用了之后的提升是多少
5. 项目难点设计
   1. FGC：在代码里埋藏一个fgc内存泄漏的bug，看java虚拟机看哪些情况会导致内存泄漏，看将如何排查系统fgc bug的博客，找一个bug植入到自己的系统，mock一些流量，然后按照fgc排查套路
   2. cpu飙升：套路一样
   3. 并发问题
