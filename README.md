# imoney

一款供个人使用的记账应用 🚀

## 主要功能

### 1. 流水统计

    统计 `结余`，`收入`，`支出` 信息

    清单： 按时间及其收入/支出类型进行分类统计

    图表： 1. 收入/支出占比， 2. 收入/支出走势

### 2. 资产统计

    统计 `总资产`，`可动产`，`不可动产` 信息

    清单： 1. 现金， 2. 储蓄卡， 2. 理财

    图表： 1. 资产占比， 2. 资产走势

### 3. 目标

    可制定流水目标和资产目标，比如：本月支出限额是多少，目标资产是多少 💪

### 4. 数据分享

    会生成当前数据统计报告，类似于支付宝的年度报告 📖

### 5. 搜索功能

    输入时间可生成相应时间的数据统计报告，与分享功能生成的数据统计报告会有所不同，会额外加一些奇奇怪怪的话 😝

## 难点

### 理财数据自动化更新

    实现理财收益/亏损信息的自动获取，需要使用以下接口：

    > https://api.doctorxiong.club/v1/fund/detail/?code=013180

### 数据统计报告生成

    这个还需调研如何实现 😭

来一张草稿图 😳：

![designdraft](/image/designdraft.jpeg)