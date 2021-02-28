<!-- PROJECT SHIELDS -->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![Apache 2.0 License][license-shield]][license-url]



<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/shishuihao/third-party-api">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">第三方API(third-party-api)</h3>

  <p align="center">
    第三方API集成(Third party api integration)!
    <br />
    <a href="https://github.com/shishuihao/third-party-api/issues">报告Bug(Report Bug)</a>
    ·
    <a href="https://github.com/shishuihao/third-party-api/issues">请求功能(Request Feature)</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>目录(Table of Contents)</summary>
  <ol>
    <li>
      <a href="#关于该项目-about-the-project">关于该项目(About The Project)</a>
      <ul>
        <li><a href="#用什么构建-built-with">用什么构建(Built With)</a></li>
      </ul>
    </li>
    <li>
      <a href="#入门指南-getting-started">入门指南(Getting Started)</a>
      <ul>
        <li><a href="#安装-installation">安装(Installation)</a></li>
      </ul>
    </li>
    <li><a href="#用法-usage">用法(Usage)</a></li>
    <li><a href="#路线图-roadmap">路线图(Roadmap)</a></li>
    <li><a href="#贡献-contributing">贡献(Contributing)</a></li>
    <li><a href="#许可证-license">许可证(License)</a></li>
    <li><a href="#联系方式-contact">联系方式(Contact)</a></li>
    <li><a href="#致谢-acknowledgements">致谢(Acknowledgements)</a></li>
  </ol>
</details>



<!-- 关于该项目(ABOUT THE PROJECT) -->
## 关于该项目 About The Project

[![Product Name Screen Shot][product-screenshot]](https://third-party-api.com)

GitHub上有很多很棒的第三方接口集成，但是我找不到真正适合我需要的，因此我创建了这个我认为比较优雅的实现。
我想创建一个第三方接口集成，如此出色，以至于它将成为您需要的最后一个-我想就是这样。

# 特点
  + 模块化设计
  + 高度抽象，统一接口
  + spi(Service Provider Interface)，可插拔
  + 方法使用更优雅

当然，由于您的需求可能不同，因此没有一个模板可以为所有项目提供服务。
因此，我将在不久的将来添加更多内容。
您也可以通过分叉此存储库并创建请求请求或打开问题来提出更改建议。
感谢所有为该模板的扩展做出贡献的人们！

致谢中列出了一些我认为有用的常用资源。

### 用什么构建 Built With

本节列出在构建项目时使用的所有主要框架。在致谢(acknowledgements)部分留下任何附加组件/插件。
* [Gradle](https://gradle.org/)
* [Java 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)


<!-- GETTING STARTED -->
## 入门指南 Getting Started

### 安装 Installation

* Maven
  ```xml
  <dependency>
    <groupId>cn.shishuihao</groupId>
    <artifactId>third-party-api</artifactId>
    <version>latest</version>
  </dependency>
  ```
  
* Gradle
  ```grovvy
  compile 'cn.shishuihao:third-party-api:latest'
  ```



<!-- USAGE EXAMPLES -->
## 用法 Usage

  + 自动发现
    + [x] spi
    + [x] 容器
      + [x] [springboot](/third-party-api-spring-boot-starter/README.md)
  + 配置属性获取方式
    + [x] 代码
    + [x] 容器
      + [x] [springboot](/third-party-api-spring-boot-starter/README.md)
    + [x] 数据库
      + [x] [jpa](/third-party-api-spring-boot-jpa/README.md)
      + [x] [mybatis-plus](/third-party-api-spring-boot-mybatis-plus/README.md)
      + [x] [redis](/third-party-api-spring-boot-redis/README.md)
      + [x] [mongodb](/third-party-api-spring-boot-mongodb/README.md)
  + [x] SMS集成(sms integration)
    + [x] [阿里云](/third-party-api-sms-aliyun/README.md)
      + [X] 发送短信
      + [X] 批量发送短信
    + [X] [腾讯云](/third-party-api-sms-tencent/README.md)
      + [X] 发送短信
      + [X] 批量发送短信
  + [x] 推送集成(push integration)
    + [X] [小米](/third-party-api-push-xiaomi/README.md)
      + [X] 发送消息
    + [ ] 华为
    + [ ] vivo
    + [ ] oppo
    + [ ] 魅族
    + [ ] 苹果
    + [ ] 谷歌
    + [ ] 极光推送
  + [ ] 支付集成
    + [ ] 支付宝
    + [ ] 微信
    + [ ] 银联
    + [ ] 京东
    + [ ] PayPal
    + [ ] 苹果内购
    + [ ] 工商银行
  + [ ] 登录集成
  + [ ] 分享集成

* _有关更多示例，请参考[文档](https://third-party-api.com)_
* _For more examples, please refer to the [Documentation](https://third-party-api.com)_




<!-- ROADMAP -->
## 路线图 Roadmap

* 请参阅[未解决的问题](https://github.com/shishuihao/third-party-api/issues)，以获取提出了功能（和已知问题）的列表。
* See the [open issues](https://github.com/shishuihao/third-party-api/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## 贡献 Contributing

1. 分叉项目(Fork the Project)
2. 创建您的功能分支(Create your Feature Branch) (`git checkout -b feature/AmazingFeature`)
3. 提交您的更改(Commit your Changes) (`git commit -m 'Add some AmazingFeature'`)
4. 推到分支(Push to the Branch) (`git push origin feature/AmazingFeature`)
5. 打开拉取请求(Open a Pull Request)



<!-- LICENSE -->
## 许可证 License

* 根据Apache 2.0许可证分发。有关更多信息，请参见[Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)
* Distributed under the Apache 2.0 License. See [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0) for more information.



<!-- CONTACT -->
## 联系方式 Contact 

[shishuihao](https://github.com/shishuihao/) - <img width="150" src="https://avatars.githubusercontent.com/u/25605201?s=100&v=4">  - 1285173409@qq.com

下面链接(Project Link): [https://github.com/shishuihao/third-party-api](https://github.com/shishuihao/third-party-api)

<!-- ACKNOWLEDGEMENTS -->
## 致谢 Acknowledgements 
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Mybatis-Plus](https://mp.baomidou.com/)
* [Best-README-Template](https://github.com/othneildrew/Best-README-Template)



# 捐助 Donate

如果您觉得我的项目对您有帮助，并且您愿意给予我一点小小的支持，您可以通过以下方式向我捐助，这样可以维持项目持续地发展，灰常感谢！(/ω＼)

| 支付宝(Alipay) | 微信(Wechat) | 
| :------: | :------: | 
| <img width="150" src="./docs/donate/alipay.png"> | <img width="150" src="./docs/donate/wechat.jpg"> | 

❤❤❤

# 捐助者名单 Donor list

（如果这里还没有你的名字？请发邮件至 1285173409@qq.com 告诉我）

| 捐助日期 | 捐助者 | 捐助金额 |
| --- | --- | --- |

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/shishuihao/third-party-api.svg?style=for-the-badge
[contributors-url]: https://github.com/shishuihao/third-party-api/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/shishuihao/third-party-api.svg?style=for-the-badge
[forks-url]: https://github.com/shishuihao/third-party-api/network/members
[stars-shield]: https://img.shields.io/github/stars/shishuihao/third-party-api.svg?style=for-the-badge
[stars-url]: https://github.com/shishuihao/third-party-api/stargazers
[issues-shield]: https://img.shields.io/github/issues/shishuihao/third-party-api.svg?style=for-the-badge
[issues-url]: https://github.com/shishuihao/third-party-api/issues
[license-shield]: https://img.shields.io/github/license/shishuihao/third-party-api.svg?style=for-the-badge
[license-url]: https://github.com/shishuihao/third-party-api/blob/master/LICENSE.txt
[product-screenshot]: images/screenshot.png
