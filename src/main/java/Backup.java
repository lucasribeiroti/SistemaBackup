package src.main.java;

public abstract class Backup {

    protected BackupService backupService;
    public String tipoBackup;

    public Backup(BackupService backupService, String tipoBackup) {
        this.backupService = backupService;
        this.tipoBackup = tipoBackup;
    }

    public abstract String realizarBackup();
}