package src.main.java;

public class BackupCompleto extends Backup {

    public BackupCompleto(BackupService backupService) {
        super(backupService, "Completo");
    }

    @Override
    public String realizarBackup() {
        return backupService.backupCompleto();
    }
}