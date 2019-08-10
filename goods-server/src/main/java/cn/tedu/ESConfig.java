package cn.tedu;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "es")
public class ESConfig {
    private List<String> nodes ;
    @Bean
    public TransportClient transportClient(){
        PreBuiltTransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        for (String node:nodes) {
            String host = node.split(":")[0];
            int port = Integer.parseInt(node.split(":")[1]);
            try {
                //给定多个连接节点,实现高可用客户端,只要给定节点不全部宕机
                InetAddress byName = InetAddress.getByName(host);
                //端口为9300
                client.addTransportAddress(new InetSocketTransportAddress(byName, port));
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        return  client;
    }
    public List<String> getNodes() {
        return nodes;
    }

    public void setNodes(List<String> nodes) {
        this.nodes = nodes;
    }
}
