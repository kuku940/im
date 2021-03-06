package cn.xiaoyu.learning.im.client.console;

import cn.xiaoyu.learning.im.protocol.request.JoinGroupRequestPacket;
import io.netty.channel.Channel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Scanner;

/**
 * @author roin.zhang
 * @date 2019/10/24
 */
public class JoinGroupConsoleCommand implements ConsoleCommand {
    private static final Log LOGGER = LogFactory.getLog(JoinGroupConsoleCommand.class);

    @Override
    public void exec(Scanner scanner, Channel channel) {
        JoinGroupRequestPacket joinGroupRequestPacket = new JoinGroupRequestPacket();
        LOGGER.info("输入加入群聊GroupId：");

        String groupId = scanner.nextLine();
        joinGroupRequestPacket.setGroupId(groupId);
        channel.writeAndFlush(joinGroupRequestPacket);
    }
}
