import React, {useState} from 'react';
import {View, Button, StyleSheet} from 'react-native';
import AppModal from '../components/appModal/appModal';

const Home = () => {
  const [modalVisible, setModalVisible] = useState(false);
  return (
    <View style={styles.container}>
      <Button
        style={styles.button}
        title="Micro survey Pop up"
        onPress={() => {
          // Handle Micro survey Pop up button click
          setModalVisible(true);
        }}
      />
      <Button
        style={styles.button}
        title="Log Out"
        onPress={() => {
          // Handle Log Out button click
        }}
      />
      <AppModal setModalVisible={setModalVisible} modalVisible={modalVisible} />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  button: {
    marginBottom: 30,
  },
});

export default Home;
