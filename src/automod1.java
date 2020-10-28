import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

 public class automod1 extends ListenerAdapter {
	 public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		 String[] arg1 = event.getMessage().getContentRaw().split(" ");
		 String string = event.getMessage().getContentRaw();
		 
		 
		 if (string.toLowerCase().contains("nigger")||string.toLowerCase().contains("nigga")||string.toLowerCase().contains("niger")) {
	 
			 EmbedBuilder info = new EmbedBuilder();
			 info.setTitle("GG to this guy"+ event.getMember().getAsMention()+"on getting banned");
			 info.setDescription("Imagine saying the N-word...");
			 info.setImage("https://media.discordapp.net/attachments/664941342895636520/770383670941843516/obama.PNG");
			 event.getChannel().sendMessage(info.build()).queue();
			info.clear();
			event.getChannel().sendMessage("Hello "+event.getMember().getAsMention()+", you will be banned in 10 seconds").queue();
			 
			
					Member member = event.getMember();
					member.getUser().openPrivateChannel().queue(channel ->{
						channel.sendMessage("You will be banned in: \n20").queue();
					});
					int a;
					a=20;
					while (a>0) {
						a--;
						String s = String.valueOf(a);
						try {
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
						
						member.getUser().openPrivateChannel().queue(channel ->{
							channel.sendMessage(s).queue();
						});
			          
					}
					
					
		    event.getMember().ban(7).queue();
		    
				 
				 }
			 }
		 }
 
 
