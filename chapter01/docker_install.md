# Docker安装

## 搭建 Docker 运行环境
既然 Docker 是一款实用软件，我们就不得不先从它的安装说起，只有让 Docker 运行在我们的计算机上，才能更方便我们对 Docker 相关知识和使用方式的学习。得益于与商业性的优雅结合，Docker 背后拥有大量的优秀开发者为其提供技术支持，而这个优势所造就的结果之一，就是 Docker 拥有丰富且完善的安装体系，我们可以很轻松的通过多种方式安装和运行 Docker。

## 安装前的准备
由于 Docker 容器实现本身就采用了 Linux 内核中很多的特性，所以它自然与 Linux 系统亲密性很高，所以我们可以很轻松的将 Docker Engine 安装在 Linux 系统中。

不过，在安装之前，我还得不厌其烦的啰嗦一些基本概念，让大家在安装 Docker 时能够更好的进行选择。掌握这些概念，能够帮助大家理解一些安装流程中操作的目的，不至于总是一味的进行“下一步”式安装。

## Docker Engine 的版本
在安装 Docker 之前，我们先来了解一下 Docker 的版本定义，这有利于我们在之后的开发中选择和使用合适的 Docker 版本。

对于 Docker Engine 来说，其主要分为两个系列：
* 社区版 ( CE, Community Edition )
* 企业版 ( EE, Enterprise Edition )

社区版 ( Docker Engine CE ) 主要提供了 Docker 中的容器管理等基础功能，主要针对开发者和小型团队进行开发和试验。而企业版 ( Docker Engine EE ) 则在社区版的基础上增加了诸如容器管理、镜像管理、插件、安全等额外服务与功能，为容器的稳定运行提供了支持，适合于中大型项目的线上运行。

社区版和企业版的另一区别就是免费与收费了。对于我们开发者来说，社区版已经提供了 Docker 所有核心的功能，足够满足我们在开发、测试中的需求，所以我们直接选择使用社区版进行开发即可。在这本小册中，所有的内容也是围绕着社区版的 Docker Engine 展开的。

从另外一个角度，Docker Engine 的迭代版本又会分为稳定版 ( Stable release ) 和预览版 ( Edge release )。不论是稳定版还是预览版，它们都会以发布时的年月来命名版本号，例如如 17 年 3 月的版本，版本号就是 17.03。

## Docker 的环境依赖
由于 Docker 的容器隔离依赖于 Linux 内核中的相关支持，所以使用 Docker 首先需要确保安装机器的 Linux kernel 中包含 Docker 所需要使用的特性。以目前 Docker 官方主要维护的版本为例，我们需要使用基于 Linux kernel 3.10 以上版本的 Linux 系统来安装 Docker。

也许 Linux kernel 的版本还不够直观，下面的表格就直接展示了 Docker 对主流几款 Linux 系统版本的要求。

## 在 Linux 系统中安装 Docker
因为 Docker 本身就基于 Linux 的核心能力，同时目前主流的 Linux 系统中所拥有的软件包管理程序，已经可以很轻松的帮助我们处理各种依赖问题，所以在 Linux 中安装 Docker 并非什么难事。

更多的细节就不多说了，Docker 已经为我们准备了好了各系统的安装包，毕竟安装 Docker 并不是我们所要掌握的重点，所以这里我就直接给出安装的命令了。

[传送门](https://www.docker.com/products/container-runtime)
