/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class ServerManager {
    private ScheduleServer server;
    public ServerManager() {
        this.server = new ScheduleServer();
    }

    public void startServer() {
        this.server.startBooting();
        this.server.readSystemConfigFile();
        this.server.init();
        this.server.initializeContext();
        this.server.initializeListeners();
        this.server.createSystemObjects();
        System.out.println("\tStart working......\n");
    }

    public void stopServer() {
        System.out.println("\tAfter work done.........");
        this.server.releaseProcesses();
        this.server.destroy();
        this.server.destroySystemObjects();
        this.server.destroyListeners();
        this.server.destroyContext();
        this.server.shutdown();
    }
}
