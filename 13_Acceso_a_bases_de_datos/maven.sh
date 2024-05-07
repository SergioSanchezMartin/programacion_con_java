mvn org.apache.maven.plugins:maven-archetype-plugin:3.1.2:generate -DarchetypeArtifactId="maven-archetype-webapp" -DarchetypeGroupId="org.apache.maven.archetypes" -DarchetypeVersion="1.4" -DgroupId="com.ssanmar580q" -DartifactId="$1"
mkdir $1/vscode
cp ./archivos\ MAVEN/*.* $1/vscode
mv $1/vscode $1/.vscode

# Creo la estructura de carpeta que falta para las clases Java
mkdir -p $1/src/main/java/modules

# Creo las carpeta assets para imagenes y estilos css
mkdir -p $1/src/main/webapp/assets/css
mkdir -p $1/src/main/webapp/assets/img

# Abrimos VS Code desde la carpeta del proyecto
cd $1
code .
