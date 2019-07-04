public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render(){
        if(messageProvider == null){
            throw new RuntimeException("you must set the property messageProvider of class:"
            + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider){
        this.messageProvider = provider;
    }

    String rendererClass = props.getProperty("renderer.class");
    String providerClass = props.getProperty("provider.class");

    renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
    provider = (MessageProvider) Class.forName(providerClass).newInstance();

    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }
    static{
        instance = new MessageSupportFactory();
        }

        public static MessageSupportFactory getInstance(){
            return instance;
        }

        public MessageRenderer getMessageRenderer(){
            return renderer;
        }

        public MessageProvider getMessageProvider(){
            return provider;
        }
}

