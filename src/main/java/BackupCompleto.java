package src.main.java;

public class BackupCompleto extends Backup {

    public BackupCompleto(BackupService backupService) {
        super(backupService, "Completo");
    }

    @Override
    public void realizarBackup() {
        System.out.println("Iniciando backup completo.");
        backupService.backupCompleto();
    }
}