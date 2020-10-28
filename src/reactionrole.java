import java.util.Random;
import java.util.List;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.HashMap;
 public class reactionrole extends ListenerAdapter {
	 
	 final long channelID = 770101111150870539L;
		final long roleID = 770100157068345344L;
	final long messageID = 770101131137122324L;
	 
		public void onMessageReactionAdd(MessageReactionAddEvent event) {
			
			
			if (event.getChannel().getIdLong() == channelID) {
				if (event.getMessageIdLong() == messageID) {
					Member reacte = event.getMember();
					event.getGuild().addRoleToMember(reacte, event.getJDA().getRoleById(roleID)).queue();
					
				}
			}
		}
		
		}
