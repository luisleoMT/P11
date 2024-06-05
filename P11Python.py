# Interface emulada mediante duck typing
class EmailNotificador:
    def enviar(self, mensaje):
        print(f"Enviando email: {mensaje}")

class SMSNotificador:
    def enviar(self, mensaje):
        print(f"Enviando SMS: {mensaje}")

# Función que utiliza el polimorfismo
def enviar_notificacion(notificador, mensaje):
    notificador.enviar(mensaje)

# Crear instancias de los notificadores
email = EmailNotificador()
sms = SMSNotificador()

# Usar los notificadores de manera polimórfica
enviar_notificacion(email, "Hola! Este es un mensaje de prueba.")
enviar_notificacion(sms, "Hola! Este es un mensaje de prueba.")

# Otra forma de polimorfismo
lista = [EmailNotificador(), SMSNotificador()]
for l in lista:
    l.enviar("Mensaje genérico de prueba")
