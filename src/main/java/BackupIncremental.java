package src.main.java;

public class BackupIncremental extends Backup {

    public BackupIncremental(BackupService backupService) {
        super(backupService, "Incremental");
    }

    @Override
    public void realizarBackup() {
        System.out.println("Iniciando backup incremental.");
        backupService.backupIncremental();
    }
}