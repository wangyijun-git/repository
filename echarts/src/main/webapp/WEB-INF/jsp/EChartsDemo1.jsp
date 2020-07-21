<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>我的Echarts</title>
    <!-- 引入echarts.js -->
    <%-- 经过Controller返回jsp的视图给用户, 当前URL不发生改变, 还是xxx.action,
    而xxx.action在运行时环境中是WEB-INF/classes目录下的, echarts.js就找不着了--%>
    <%--<script src="../js/echarts.js"></script>--%>
    <script src="${pageContext.request.contextPath}/js/echarts.js"></script>
</head>
<body>
    <!-- 准备Dom -->
    <div id="main" style="width: 600px; height: 400px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom, 初始化echarts实例
        var myChart = echarts.init(document.getElementById("main"));
        var option = {
            title: {
                text: 'ECharts 入门示例'
            },
            tooltip: {},
            legend: {
                data:['销量']
            },
            xAxis: {
                data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
            },
            yAxis: {},
            series: [{
                name: '销量',
                type: 'bar',
                data: [5, 20, 36, 10, 10, 20]
            }]
        };

        // 使用刚指定的配置项和数据显示图表
        myChart.setOption(option)
    </script>
</body>
</html>