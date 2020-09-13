

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registro</title>    
        <link rel="icon" type="image/png" href="elements/img/ballon.png" />
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minimun-scale=1.0">
        <link href="elements/css/style.css" rel="stylesheet" type="text/css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="./css/style.css"/>
    </head>
    <body>
        <div>
            <header class="header" >
            <div class="logo" >
                <h1>Panederia el Globito</h1>
                <img src="elements/img/ballon.png">      
            </div>
            <nav class="menu" >
                <a href="index.html">Principal</a>
                <a href="meetus.html">Nosotros</a>
                <a href="Productos.html">Productos</a>
                <a href="Contacto.html">Contacto</a>
                <a href="log_in.html"><img src="elements/img/User.png" width="30" title="Iniciar Sesión"></a>
            </nav>
        </header>
            <br>
            <section id="form2">
                <br>
                <article><center>
                        <h2>Formulario de Registro</h2>
                        <br>
                        <form method="post" name="formulario" action="registrarse">
                            <label>Nombre: <br></label> <input type="text" name="nombre">
                            <br>
                            <br>
                            <label>Apellido paterno:<br> </label><input type="text" name="appt">
                            <br>
                            <br>
                            <label>Nombre de usuario:<br> </label><input type="text" name="usu">
                            <br>
                            <br>
                            <label>Contraseña<br></label><input type="password" name="pass">
                            <br>
                            <br>
                            <input type="submit" value="Registrame">
                            <br>
                            <br>
                            
                            ¿Ya tienes cuenta? inicia sesión da click <a href="log_in.jsp">aquí</a>
                            </form></center></article>
                <br>
            </section>
            <br>
             <footer class="footer" >
            <p>Desarrollado por un batiziano más</p>
        </footer>
        </div>
    </body>
</html>
