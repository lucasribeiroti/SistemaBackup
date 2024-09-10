package src.main.java;

public class BackupIncremental extends Backup {

    public BackupIncremental(BackupService backupService) {
        super(backupService, "Incremental");
    }

    @Override
    public String realizarBackup() {
        return backupService.backupIncremental();
    }
}
